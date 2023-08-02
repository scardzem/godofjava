package e.io.object;

import java.io.Serializable;

public class SerialDTO implements Serializable{
	static final long serialVersionUID = 1L;  //744페이지에서 readObject 이후에 추가한 변수
	private String bookTypes = "IT";  //744페이지에서 readObject 이후에 추가한 변수
	private String bookName;
    transient private int bookOrder;  //746페이지에서 transient 예약어 추가
    private boolean bestSeller;
    private long soldPerDay;
    public SerialDTO(String bookName, int bookOrder, boolean bestSeller,
                     long soldPerDay) {
//        super();
        this.bookName = bookName;
        this.bookOrder = bookOrder;
        this.bestSeller = bestSeller;
        this.soldPerDay = soldPerDay;
    }
    @Override
    public String toString() {
        return "SerialDTO [bookName=" + bookName + ", bookOrder=" + bookOrder
                + ", bestSeller=" + bestSeller + ", soldPerDay=" + soldPerDay
                + ", bookTypes = " + bookTypes + "]";
    }
}
