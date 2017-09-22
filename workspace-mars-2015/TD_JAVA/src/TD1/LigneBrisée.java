package TD1;

import java.util.LinkedList;
import java.util.Objects;

public class LigneBrisée {
	
	private LinkedList<Point> tableauPoint;
	private int index = 0;
	
	public LigneBrisée(int capacite) {
		this.tableauPoint = new LinkedList<Point>();
	}
	
	public void add(Point p){
		/*if(index + 1  == tableauPoint.length){
			throw new IndexOutOfBoundsException();
		}
		tableauPoint[this.index] = Objects.requireNonNull(p);
		index++;*/
		tableauPoint.add(p);
		
		
	}
	
	public int pointCapacity(){
		return tableauPoint.length;
	}
	
	public int nbPoints(){
		return index+1;
	}
	
	public boolean contains(Point p){
		Boolean bool = false;
		for(Point point: tableauPoint){
			if(p.equals(point)){
				bool = true;
			}
		}
		return bool;
	}
	
	public static void main(String[] args) {
	  
	}
	
}
