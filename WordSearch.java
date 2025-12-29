public class WordSearch {
public static void wordSearch(char[][] board, String word) { // Leet 79
        int indexPointer = 0;
        StringBuilder ans = new StringBuilder();
        char element = word.charAt(indexPointer);
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == element) {
                    ans.append(element);
                    indexPointer++;
                    element = word.charAt(indexPointer);
                    board[i][j] = ' ';
                }
                    if (board[i][j]== element) {
                        ans.append(element);
                        indexPointer++;
                        element = word.charAt(indexPointer);
                    } if (i!=board.length-1) {
                      if (board[i+1][j]==element) {
                        ans.append(element);
                        indexPointer++;
                        element = word.charAt(indexPointer);
                    }  
                    }  else if (j!=0) {
                        if (board[i][j-1]==element) {
                            ans.append(element);
                            indexPointer++;
                            element = word.charAt(indexPointer);
                        }
                    }else if (i!=0) {
                        if (board[i-1][j]==element) {
                            ans.append(element);
                            indexPointer++;
                            element = word.charAt(indexPointer);
                        }
                }
            }
        }
    }

    public static void wordSearch1(char[][] board, String word) { // Leet 79
    int indexPointer = 0;
    StringBuilder ans = new StringBuilder();
    char element = word.charAt(indexPointer);

    int i = 0;
    while (i < board.length) {
        int j = 0;
        while (j < board[i].length) {

            if (board[i][j] == element) {
                ans.append(element);
                indexPointer++;
                element = word.charAt(indexPointer);
                board[i][j] = ' ';
                if (i!=board[i].length-1){
                if (element==board[i+1][j] ){
                    i++;
                }
                }else if (element==board[i][j+1]){
                    j++;
                } else if (element==board[j-1][j]){
                    i--;
                }else if (element==board[i][j-1]){
                    j--;
                }
            }

//            if (board[i][j] == element) {
//                ans.append(element);
//                indexPointer++;
//                element = word.charAt(indexPointer);
//                if (i!=board[i].length-1){
//                    if (element==board[i+1][j]){
//                        i++;
//                    }
//                }
//                else if (element==board[i][j+1]){
//                    j++;
//                } else if (element==board[j-1][j]){
//                    i--;
//                }else if (element==board[i][j-1]){
//                    j--;
//                }
//            }

            if (i != board.length - 1) {
                if (board[i + 1][j] == element) {
                    ans.append(element);
                    indexPointer++;
                    element = word.charAt(indexPointer);
                    if (element==board[i+1][j]){
                        i++;
                    } else if (element==board[i][j+1]){
                        j++;
                    } else if (element==board[j-1][j]){
                        i--;
                    }else if (element==board[i][j-1]){
                        j--;
                    }
                }
            } else if (j != 0) {
                if (board[i][j - 1] == element) {
                    ans.append(element);
                    indexPointer++;
                    element = word.charAt(indexPointer);
                    if (element==board[i+1][j]){
                        i++;
                    } else if (element==board[i][j+1]){
                        j++;
                    } else if (element==board[j-1][j]){
                        i--;
                    }else if (element==board[i][j-1]){
                        j--;
                    }
                }
            } else if (i != 0) {
                if (board[i - 1][j] == element) {
                    ans.append(element);
                    indexPointer++;
                    element = word.charAt(indexPointer);
                    if (element==board[i+1][j]){
                        i++;
                    } else if (element==board[i][j+1]){
                        j++;
                    } else if (element==board[j-1][j]){
                        i--;
                    }else if (element==board[i][j-1]){
                        j--;
                    }
                }
            }

        }
    }
}

    
    public static int[] search2D(int arr[][], int target) {
        int row = 0;
        int col = arr.length - 1;
        while (row < arr.length && col >= 0) {
            if (arr[row][col] == target) {
                return new int[] { row, col };
            } else if (arr[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return new int[] { -1, -1 };
    }
}
