package thuctap.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name = "account")
public class Account {
	@Id
	@NotBlank(message = "- Username cannot be empty")
	private String username;
	@NotBlank(message = "- Password cannot be empty")
	@Length(min = 8, message = "- Password must be 8 characters or more")
	private String password;
	@NotBlank(message = "- Full name cannot be empty")
	private String fullName;
	@NotBlank(message = "- Gender cannot be empty")
	private String gender;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@NotNull(message = "- The date of birth cannot be empty")
	@Past(message = "- Birth date must be in the past")
	private Date birthday;
	@NotBlank(message = "- Identification number cannot be empty")
	private String identityCard;
	@Length(min = 9, max = 15, message = "- invalid phone number")
	@NotBlank(message = "- Phone number cannot be empty")
	private String phoneNumber;
	@NotBlank(message = "- Email cannot be empty")
	private String email;
	@Temporal(TemporalType.DATE)
	private Date dateSet;
	@DateTimeFormat(pattern = "HH:mm")
	private java.util.Date timeSet;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "position_id ")
	private Position position ;


	public Date getNgayTao() {
		return dateSet;
	}

	public void setNgayTao(Date ngayTao) {
		this.dateSet = ngayTao;
	}

	public java.util.Date getGioTao() {
		return timeSet;
	}

	public void setGioTao(java.util.Date gioTao) {
		this.timeSet = gioTao;
	}

	public String getTenDangNhap() {
		return username;
	}

	public void setTenDangNhap(String tenDangNhap) {
		this.username = tenDangNhap;
	}

	public String getMatKhau() {
		return password;
	}

	public void setMatKhau(String matKhau) {
		this.password = matKhau;
	}

	public String getHoTen() {
		return fullName;
	}

	public void setHoTen(String hoTen) {
		this.fullName = hoTen;
	}

	public String getGioiTinh() {
		return gender;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gender = gioiTinh;
	}

	public Date getNgaySinh() {
		return birthday;
	}	

	public void setNgaySinh(Date ngaySinh) {
		this.birthday = ngaySinh;
	}

	public String getCmnd() {
		return identityCard;
	}

	public void setCmnd(String cmnd) {
		this.identityCard = cmnd;
	}

	public String getSoDT() {
		return phoneNumber;
	}

	public void setSoDT(String soDT) {
		this.phoneNumber = soDT;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getIdentityCard() {
		return identityCard;
	}

	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getDateSet() {
		return dateSet;
	}

	public void setDateSet(Date dateSet) {
		this.dateSet = dateSet;
	}

	public java.util.Date getTimeSet() {
		return timeSet;
	}

	public void setTimeSet(java.util.Date timeSet) {
		this.timeSet = timeSet;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Position getChucVu() {
		return position;
	}

	public void setChucVu(Position chucVu) {
		this.position = chucVu;
	}

}