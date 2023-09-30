package com.study.object.object01;

//1, 이벤트 담청자는 티켓으로 교환할 초대장을 가지고 있다
//2, 이벤트에 당첨되지 않은 관람객은 티켓을 구매할 수 있는 현금을 보유하고 있다
//3, 그러므로 관람객이 가방에 갖고 있을 수 있는건 현금,티켓,쵀장 세가지뿐이다
public class Bag {
    private Long amount;//각 관람객이 갖고 있는 현금
    private Invitation invitation;//각 관람객의 초대장
    private Ticket ticket;//각 관람객의 티켓

    public Bag(Long amount){ //이벤트에 초청되지 않은 관람객은 가방에 돈은 있지만 초대장이 없음
        this.amount = amount;
    }

    public Bag(Long amount , Invitation invitation){//이벤트에 초청된 관람객은 가방에 돈과 초대장이 있음
        this.amount = amount;
        this.invitation = invitation;
    }
    public boolean hasTicket(){ //티켓의 소유 여부
        return ticket !=null;
    }

    public void setTicket(Ticket ticket){ //초대장을 티켓으로 교환
        this.ticket = ticket;
    }

    public void minusAmount(Long amount){
        this.amount -= amount;
    }

    public void plusAmount(Long amount){
        this.amount += amount;
    }
}
