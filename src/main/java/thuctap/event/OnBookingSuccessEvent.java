package thuctap.event;

import thuctap.dto.BookingDTO;
import thuctap.model.Room;

import org.springframework.context.ApplicationEvent;

public class OnBookingSuccessEvent extends ApplicationEvent {

	private static final long serialVersionUID = 1L;
	private String appUrl;
	private BookingDTO bookingDTO;
	private Room phong;

	public OnBookingSuccessEvent(BookingDTO bookingDTO, String appUrl, Room phong) {
		super(bookingDTO);
		this.appUrl = appUrl;
		this.bookingDTO = bookingDTO;
		this.phong = phong;
	}

	public Room getPhong() {
		return phong;
	}

	public void setPhong(Room phong) {
		this.phong = phong;
	}

	public String getAppUrl() {
		return appUrl;
	}

	public void setAppUrl(String appUrl) {
		this.appUrl = appUrl;
	}

	public BookingDTO getBookingDTO() {
		return bookingDTO;
	}

	public void setBookingDTO(BookingDTO bookingDTO) {
		this.bookingDTO = bookingDTO;
	}
}
