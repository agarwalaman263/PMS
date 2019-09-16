package com.philips.pms.objects;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import com.philips.pms.generator.sockets.SessionMessageSenderImpl;

public class ListData {
	public static boolean bed1=false;
	public static int bedIdCounter=1;
	public static int patientIdCounter=1;
	public static SessionMessageSenderImpl msg=new SessionMessageSenderImpl();
	public static ArrayList<Bed> bedList=new ArrayList<>();
	public static ArrayList<Patients> patientList=new ArrayList<>();
	public static Queue<Patients> patientDischargeQueue=new LinkedList<>();
	public static Queue<Patients> patientAdmitQueue=new LinkedList<>();

}