STAT X = 3
RESPAWN-WHILE(X != 0){
    STAT X = ROLL
    STAT Y = ROLL
    STAT X = X + Y
    DETECTION-METER |X|
    SHOOT-IF(X == 3){
        DETECTION-METER |"DONT PASS WINS"|
        STAT X = 0
    }
    SHOOT-IF(X == 7 || X == 4){
        DETECTION-METER |"PASS WINS!" |
        STAT X = 0 
    }
}

