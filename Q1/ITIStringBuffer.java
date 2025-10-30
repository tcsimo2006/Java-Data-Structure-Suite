public class ITIStringBuffer {
	
	private SinglyLinkedList<Character> strings;
	
    public ITIStringBuffer() {
       this.strings = new SinglyLinkedList<>();
    }

    public ITIStringBuffer(String  firstString){
		this.strings = new SinglyLinkedList<>();
		for (char c: firstString.toCharArray()){
			this.strings.add(c);
		}
		
    }

    public void append(String nextString){
        for (char c: nextString.toCharArray()){
			this.strings.add(c);
		}
    }

    public String toString(){
		char[] cArray = new char[strings.size()];
		int i=0;
		for (Character c : strings){
			cArray[i] = c;
			i++;
		}
		return new String(cArray);
    }

}
