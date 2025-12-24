public class RecursionArray {
    public static void main(String[] args) {
        int arr[] = {1,2, 3, 5, 5 ,7, 7, 7, 8, 12, 13, 15, 15, 15, 19};
        // System.out.println(checkSortedArray(arr));
        // System.out.println(linearSearch(arr, 15, 0));
        char strArr[][] = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        wordSearch(strArr, "SEE");
        
    }
    // GFG - check if array is sorted.
    public static boolean checkSortedArray(int arr[]) {
        return checkSortedArrayHelper(arr, 0);
    }
    public static boolean checkSortedArrayHelper(int arr[],int index) {
        if (index==arr.length-1) {
            return true;
        }
        return arr[index]<=arr[index+1] && checkSortedArrayHelper(arr, ++index);
    }

    public static int linearSearch(int arr[],int target,int i) {
        if (arr==null || i==arr.length) {
            return -1;
        }
        if (arr[i]==target) {
            return i;
        }
        
        return linearSearch(arr, target, i+1);
        
    }

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
