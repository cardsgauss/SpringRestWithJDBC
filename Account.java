package com.scb.gauss.bean;

public class Account {
int id;
String type;
float minBalance;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public float getMinBalance() {
	return minBalance;
}
public void setMinBalance(float minBalance) {
	this.minBalance = minBalance;
}
public Account(int id, String type, float minBalance) {
	super();
	this.id = id;
	this.type = type;
	this.minBalance = minBalance;
}
public Account() {
	super();
}
@Override
public String toString() {
	return "Account [id=" + id + ", type=" + type + ", minBalance=" + minBalance + "]";
}

}
