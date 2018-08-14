package com.cg.org;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;

import com.cg.address.Address;

public class Organization {

	private String name;
	private Address address;
	private double marketValue;
	private int employeeCount;
	private LocalDate established;
	private Set<String> globalPresence = new TreeSet<>();
	private List<String> boardMembers = new ArrayList<>();
	private Map<String, String> projectManagers = new HashMap<>();
	private Properties proxyServerList;
	
	public Organization() {
		
	}
	
	
	public Organization(String name, Address address, double marketValue, int employeeCount, String str,
			Set<String> globalPresence, List<String> boardMembers, Map<String, String> projectManagers,
			Properties proxyServerList) {
		super();
		this.name = name;
		this.address = address;
		this.marketValue = marketValue;
		this.employeeCount = employeeCount;
		String[] date = str.split("/");
		this.established = LocalDate.of(Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2]));
		this.globalPresence = globalPresence;
		this.boardMembers = boardMembers;
		this.projectManagers = projectManagers;
		this.proxyServerList = proxyServerList;
	}
	
	
	/*public String getName() {
		return name;
	}*/
	public void setName(String name) {
		this.name = name;
	}
	/*public Address getAddress() {
		return address;
	}*/
	public void setAddress(Address address) {
		this.address = address;
	}
	/*public double getMarketValue() {
		return marketValue;
	}*/
	public void setMarketValue(double marketValue) {
		this.marketValue = marketValue;
	}
	/*public int getEmployeeCount() {
		return employeeCount;
	}*/
	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}
	/*public LocalDate getEstablished() {
		return established;
	}*/
	public void setEstablished(String str) {
		String[] date = str.split("/");
		this.established = LocalDate.of(Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2]));
	}
	/*public Set<String> getGlobalPresence() {
		return globalPresence;
	}*/
	public void setGlobalPresence(Set<String> globalPresence) {
		this.globalPresence = globalPresence;
	}
	/*public List<String> getBoardMembers() {
		return boardMembers;
	}*/
	public void setBoardMembers(List<String> boardMembers) {
		this.boardMembers = boardMembers;
	}
	/*public Map<String, String> getProjectManagers() {
		return projectManagers;
	}*/
	public void setProjectManagers(Map<String, String> projectManagers) {
		this.projectManagers = projectManagers;
	}
	/*public Properties getProxyServerList() {
		return proxyServerList;
	}*/
	public void setProxyServerList(Properties proxyServerList) {
		this.proxyServerList = proxyServerList;
	}
		
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((boardMembers == null) ? 0 : boardMembers.hashCode());
		result = prime * result + employeeCount;
		result = prime * result + ((established == null) ? 0 : established.hashCode());
		result = prime * result + ((globalPresence == null) ? 0 : globalPresence.hashCode());
		long temp;
		temp = Double.doubleToLongBits(marketValue);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((projectManagers == null) ? 0 : projectManagers.hashCode());
		result = prime * result + ((proxyServerList == null) ? 0 : proxyServerList.hashCode());
		return result;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Organization other = (Organization) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (boardMembers == null) {
			if (other.boardMembers != null)
				return false;
		} else if (!boardMembers.equals(other.boardMembers))
			return false;
		if (employeeCount != other.employeeCount)
			return false;
		if (established == null) {
			if (other.established != null)
				return false;
		} else if (!established.equals(other.established))
			return false;
		if (globalPresence == null) {
			if (other.globalPresence != null)
				return false;
		} else if (!globalPresence.equals(other.globalPresence))
			return false;
		if (Double.doubleToLongBits(marketValue) != Double.doubleToLongBits(other.marketValue))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (projectManagers == null) {
			if (other.projectManagers != null)
				return false;
		} else if (!projectManagers.equals(other.projectManagers))
			return false;
		if (proxyServerList == null) {
			if (other.proxyServerList != null)
				return false;
		} else if (!proxyServerList.equals(other.proxyServerList))
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "Organization [name=" + name + ", address=" + address + ", marketValue=" + marketValue
				+ ", employeeCount=" + employeeCount + ", established=" + established + ", globalPresence="
				+ globalPresence + ", boardMembers=" + boardMembers + ", projectManagers=" + projectManagers
				+ ", proxyServerList=" + proxyServerList + "]";
	}
		

}
