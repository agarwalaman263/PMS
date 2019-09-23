package com.philips.pms.objects;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.philips.pms.generator.sockets.SessionMessageSenderImpl;

public class ListData {
	
	private static int bedIdCounter=-1;
	private static int patientIdCounter=-1;
	private static SessionMessageSenderImpl msg=new SessionMessageSenderImpl();
	private static List<Bed> bedList=new ArrayList<>();
	private static List<Patients> patientList=new ArrayList<>();
	private static Queue<Patients> patientDischargeQueue=new LinkedList<>();
	private static Queue<Patients> patientAdmitQueue=new LinkedList<>();
	
	public static int getBedIdCounter() {
		return bedIdCounter;
	}
	public static int setBedIdCounter(int id) {
		bedIdCounter = id;
		return bedIdCounter;
	}
	public static int getPatientIdCounter() {
		return patientIdCounter;
	}
	public static int setPatientIdCounter(int patientIdCounter) {
		ListData.patientIdCounter = patientIdCounter;
		return patientIdCounter;
	}
	public static SessionMessageSenderImpl getMsg() {
		return msg;
	}
	public static void setMsg(SessionMessageSenderImpl msg) {
		ListData.msg = msg;
	}
	public static List<Bed> getBedList() {
		return bedList;
	}
	public static void setBedList(List<Bed> bedList) {
		ListData.bedList = bedList;
	}
	public static List<Patients> getPatientList() {
		return patientList;
	}
	public static void setPatientList(List<Patients> patientList) {
		ListData.patientList = patientList;
	}
	public static Queue<Patients> getPatientDischargeQueue() {
		return patientDischargeQueue;
	}
	public static void setPatientDischargeQueue(Queue<Patients> patientDischargeQueue) {
		ListData.patientDischargeQueue = patientDischargeQueue;
	}
	public static Queue<Patients> getPatientAdmitQueue() {
		return patientAdmitQueue;
	}
	public static void setPatientAdmitQueue(Queue<Patients> patientAdmitQueue) {
		ListData.patientAdmitQueue = patientAdmitQueue;
	}
	
	
	
	
	

}
