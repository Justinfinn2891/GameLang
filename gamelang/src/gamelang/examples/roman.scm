STAT X = 3
RESPAWN-UNTIL(X != 0){
    STAT X = ROLL
    STAT Y = ROLL
    STAT X = X + Y
    PRINT |X|
    SHOOT-IF(X == 3){
        PRINT |"DONT PASS WINS"|
        STAT X = 0
    }
    SHOOT-IF(X == 7){
        PRINT |"PASS WINS!" |
        STAT X = 0 
    }
}

