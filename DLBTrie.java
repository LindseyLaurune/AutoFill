
public class DLBTrie<S, T> {
	
	private DLBNode<S, T> rootNode;		// The head of the liinked list
	
	
	/**
	 * Creates a new de la Briandais trie by creating a new, blank node
	 */
	public DLBTrie() {
		
		rootNode = new DLBNode<S, T>();		// Sets the start state to a new de la Briandais trie node
	}
	
	
	/**
	 * Fetches the reference to the head of the first linked list
	 * @return The start state for the trie
	 */
	public DLBNode<S, T> getRootNode() {
		
		return rootNode;
	}
	
	
	/**
	 * Checks to see if the trie is empty by looking at the head of the first linked list
	 * @return Returns true if the head is null
	 */
	public boolean isEmpty() {
		
		return getRootNode().hasNoKey();
	}
}

