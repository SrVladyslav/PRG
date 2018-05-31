
public class NodeString {

    public String word, traduction, description;//lo declaro public porque puedo
	public QueueInt line;
	public NodeString next;//variable referencia para apuntar objetos de tipo nodeString
	//clase del nodo de enteros
	
	/**Constructor: 
	 * @param, <b>String:</b> <i> dato del nodo.</i>*/
	public NodeString(String d){
		word = d;
	    next = null;
	}
	
	/**Constructor:
	 * @param, <b>String:</b> <i> dato del nodo.</i>
	 * @param, <b>NodeString:</b> <i> dato de la posicion next del nodo.</i>*/
	public NodeString(String d, NodeString n) {
		this.word = d;
        this.traduction = "";
        this.next = n;
        this.line = new QueueInt();
		
	}
	
	/**Constructor:
	 * @param, <b>String:</b> <i> dato del nodo.</i>
	 * @param, <b>NodeString:</b> <i> dato de la posicion next del nodo.</i>*/
	public NodeString(String w, String trad,String descr, NodeString n) {
		word = w;
		traduction = trad;
		next = n;
		description = descr;
        this.line = new QueueInt();

	}
	
	/**Constructor:
     * @param, <b>String:</b> <i> dato del nodo.</i>
     * @param, <b>NodeString:</b> <i> dato de la posicion next del nodo.</i>*/
        public NodeString(String w, String t, NodeString n) {
        this.word = w;
        this.traduction = t;
        this.next = n;
        this.line = new QueueInt();
    }
	
}
