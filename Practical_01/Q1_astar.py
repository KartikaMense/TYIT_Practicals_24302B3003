import heapq

graph = {
    "delhi": [("jaipur", 500), ("indore", 600)],
    "jaipur": [("indore", 1000), ("mumbai", 2200), ("delhi", 500)],
    "indore": [("mumbai", 1400), ("delhi", 600)],
    "mumbai": [("jaipur", 2200), ("indore", 1400)]
}

heuristics = {
    "delhi": 1700,
    "jaipur": 2200,
    "indore": 1400,
    "mumbai": 0
}

def a_star(start, goal):
    open_list = [(heuristics[start], 0, start, [start])]
    visited = set()

    while open_list:
        f, g, current, path = heapq.heappop(open_list)

        if current in visited:
            continue

        visited.add(current)

        if current == goal:
            return path, g

        for neighbor, cost in graph.get(current, []):
            if neighbor not in visited:
                g_new = g + cost
                f_new = g_new + heuristics[neighbor]
                heapq.heappush(open_list, (f_new, g_new, neighbor, path + [neighbor]))

    return None, float('inf')

path, total_cost = a_star("delhi", "mumbai")
print("Shortest Path:", " -> ".join(path))
print("Total Cost:", total_cost)

