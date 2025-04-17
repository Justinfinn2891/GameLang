PRINT |"Choose an option:" "->" "1. Start" "->" "2. Quit" "->"|
ENTER-QUEST choice

SHOOT-IF (choice == 1) {
  PRINT |"Starting game..." "->"|
}

SHOOT-IF (choice == 2) {
  PRINT |"Exiting..." "->"|
  CALL EXIT_GAME
}