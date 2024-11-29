package com.kh.flightReservation;

import java.util.Scanner;

import com.kh.flightReservation.controller.CustomerResigterManager;
import com.kh.flightReservation.view.AIRLINE_CHOICE;
import com.kh.flightReservation.view.CUSTOMER_CHOICE;
import com.kh.flightReservation.view.MENU_CHOICE;
import com.kh.flightReservation.view.MainViewer;

public class flightReservationMVCProjectMain {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		boolean exitFlag = false;
		int choiceNum;
		System.out.println(String.format("%38s", "항공권 예약 프로그램") );
		try {
			while(!exitFlag) {
				MainViewer.mainMenuView();
				choiceNum = Integer.parseInt(sc.nextLine());
				switch(choiceNum) {
				case MENU_CHOICE.CUSTOMER :
					customerMenu();
					break;
				case MENU_CHOICE.AIRLINE :
					airLineMenu();
					break;
				case MENU_CHOICE.FLIGHT :
					flightMenu();
					break;
				case MENU_CHOICE.RESERVATION :
					reservationMenu();
					break;
				case MENU_CHOICE.EXIT:
					exitFlag = true;
					break;
				default :
					System.out.println("올바른 번호를 선택해주세요.");
				}
			}
		} catch (Exception e) {
			System.out.println("입력에 오류가 있습니다. 다시 시도해주세요.");
		}
		System.out.println("프로그램을 종료합니다.");

	}
	
	private static void reservationMenu() {
//        int choiceNum;
//        ReservationResigterManager rrm = new ReservationResigterManager();
//
//        System.out.println();
//        MainViewer.reservationMenuView();
//        choiceNum = Integer.parseInt(sc.nextLine());
//        switch(choiceNum) {
//        case RESERVATION_CHOICE.LIST:
//            rrm.selectManager();
//            break;
//        case RESERVATION_CHOICE.INSERT:
//            rrm.insertManager();
//            break;
//        case RESERVATION_CHOICE.UPDATE:
//            rrm.updateManager();
//            break;
//        case RESERVATION_CHOICE.DELETE:
//            rrm.deleteManager();
//            break;
//        case RESERVATION_CHOICE.LIST_ALL:
//            rrm.selectAllManager();
//            break;
//        case RESERVATION_CHOICE.MAIN:
//            break;
//        }
//        System.out.println();
    }

	private static void flightMenu() {
		MainViewer.flightMenuView();
	}

	private static void airLineMenu() {
//        int choiceNum;
//        AirLineResigterManager arm = new AirLineResigterManager();
//
//        System.out.println();
//        MainViewer.AirLineMenuView();
//        choiceNum = Integer.parseInt(sc.nextLine());
//        switch (choiceNum) {
//        case AIRLINE_CHOICE.LIST:
//            arm.listManager();
//            break;
//        case AIRLINE_CHOICE.INSERT:
//            arm.insertManager();
//            break;
//        case AIRLINE_CHOICE.UPDATE:
//            arm.updateManager();
//            break;
//        case AIRLINE_CHOICE.DELETE:
//            arm.deleteManager();
//            break;
//        case AIRLINE_CHOICE.AIRLINE_GRADE:
//            arm.funcManager();
//            break;
//        case AIRLINE_CHOICE.MAIN:
//            break;
//        }
//        System.out.println();
    }

	private static void customerMenu() {
		int choiceNum;
		CustomerResigterManager crm = new CustomerResigterManager();
		
		System.out.println();
		MainViewer.customerMenuView();
		choiceNum = Integer.parseInt(sc.nextLine());
		switch(choiceNum) {
		case CUSTOMER_CHOICE.LIST:
			crm.selectManager();
			break;
		case CUSTOMER_CHOICE.INSERT:
			crm.insertManager();
			break;
		case CUSTOMER_CHOICE.UPDATE:
			crm.updateManager();
			break;
		case CUSTOMER_CHOICE.DELETE:
			crm.deleteManager();
			break;
		case CUSTOMER_CHOICE.GRADE_PRINT:
			crm.gradePrintManager();
			break;
		case CUSTOMER_CHOICE.MAIN:
			break;
		}
		System.out.println();
	}

}