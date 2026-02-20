jug(0,0):- 
    write("Fill 3g jug."), nl, 
    jug(0,3).

jug(0,3):- 
    write("Pour water from 3g jug to 4g jug."), nl, 
    jug(3,0).

jug(3,0):- 
    write("Fill 3g jug."), nl, 
    jug(3,3).

jug(3,3):- 
    write("Pour water from 3g jug to 4g jug until the 4g jug is full."), nl, 
    jug(4,2).

jug(4,2):- 
    write("Empty 4g jug."), nl, 
    jug(0,2).

jug(0,2):- 
    write("Pour water from 3g jug to 4g jug."), nl, 
    jug(2,0).

jug(2,0):- 
    write("Goal state reached.").

jug(X,Y):- 
    X>4, Y=<3, 
    write("4g jug overflowed").

jug(X,Y):- 
    X=<4, Y>3, 
    write("3g jug overflowed").

jug(X,Y):- 
    X>4, Y>3, 
    write("Both jugs overflowed").
