package riskgame.pojo;

import java.util.List;

/**
 * 
 * @author Admin
 *This is the node
 */
public class SRCountry {
	private String name;
	private int armies;
	private Continent continentName;
	private int x;  //coordinate for graph
	private int y;  //coordinate for graph
	private List<SRCountry> adjacencyList;
	public SRCountry(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getArmies() {
		return armies;
	}
	public void setArmies(int armies) {
		this.armies = armies;
	}
	public Continent getContinentName() {
		return continentName;
	}
	public void setContinentName(Continent continentName) {
		this.continentName = continentName;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	public List<SRCountry> getAdjacencyList() {
		return adjacencyList;
	}

	public void setAdjacencyList(List<SRCountry> adjacencyList) {
		this.adjacencyList = adjacencyList;
	}
	
	
	
}
