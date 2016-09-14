package word_search;

public class WordSearch {
//	79. Word Search  QuestionEditorial Solution  My Submissions
//	Total Accepted: 81863
//	Total Submissions: 345787
//	Difficulty: Medium
//	Given a 2D board and a word, find if the word exists in the grid.
//
//	The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.
//
//	For example,
//	Given board =
//
//	[
//	  ['A','B','C','E'],
//	  ['S','F','C','S'],
//	  ['A','D','E','E']
//	]
//	word = "ABCCED", -> returns true,
//	word = "SEE", -> returns true,
//	word = "ABCB", -> returns false.
	public static boolean exist(char[][] board, String word) {
	    char[] w = word.toCharArray();
	    for (int y = 0; y < board.length; y++) {
	    	for (int x = 0; x < board[0].length; x++) {
	    		if (exist(board, y, x, w, 0)) return true;
	    	}
	    }
	    return false;
	}

	private static boolean exist(char[][] board, int y, int x, char[] word, int i) {
		if (i == word.length) return true;
		if (y < 0 || x < 0 || y == board.length || x == board[0].length) return false;
		if (board[y][x] != word[i]) return false;
		// Change the former number to avoid loop.
		board[y][x] ^= 64;
		boolean exist = exist(board, y, x+1, word, i+1) || exist(board, y, x-1, word, i+1) || exist(board, y+1, x, word, i+1) || exist(board, y-1, x, word, i+1);
		// recover that number
		board[y][x] ^= 264;
		return exist;
	}
}
