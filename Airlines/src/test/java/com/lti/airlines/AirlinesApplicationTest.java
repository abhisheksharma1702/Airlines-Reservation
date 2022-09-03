package com.lti.airlines;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import java.util.List;

import javax.transaction.Transactional;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.lti.airlines.model.AdminDetails;
import com.lti.airlines.model.FlightDetails;
import com.lti.airlines.model.MailDetails;
import com.lti.airlines.model.Registation;
import com.lti.airlines.repo.FlightDetailsRepository;
import com.lti.airlines.repo.RegistationRepository;
import com.lti.airlines.service.AdminDetailsService;
import com.lti.airlines.service.FlightDetailsService;
import com.lti.airlines.service.MailDetailsService;
import com.lti.airlines.service.PassangerDetailsService;
import com.lti.airlines.service.PaymentDetailsService;
import com.lti.airlines.service.RegistationService;
import com.lti.airlines.service.SeatService;
import com.lti.airlines.service.TicketDetailsService;


import java.time.LocalDate;

import com.lti.airlines.model.Seat;
import com.lti.airlines.model.TicketDetails;


@ExtendWith(SpringExtension.class)
@Transactional
@SpringBootTest(classes = AirlinesApplication.class)
class AirlinesApplicationTest {

	@Autowired
	AdminDetailsService ser;
	@Autowired
	AdminDetailsService adminService;
	@Autowired
	FlightDetailsService flightService;
	@Autowired
	FlightDetailsRepository flightrepo;
	@Autowired
	RegistationService regService;
	@Autowired
	RegistationRepository regrepo;
	@Autowired
	PassangerDetailsService passService;
	@Autowired
	SeatService seatService;
	@Autowired
	PaymentDetailsService payService;
	@Autowired
	TicketDetailsService ticketService;
	@Autowired
	MailDetailsService mailService;
	
	//Admin
	@Test
	void getAdminTest() {
		AdminDetails a = new AdminDetails("admin","admin");
		assertEquals(a.getUserid(), ser.getAdminDetails().get(0).getUserid());
	}
	
	@Test
	void loginAdminTest()
	{
		AdminDetails a = new AdminDetails();
		a.setUserid("admin");
		a.setPassword("admin");
		assertEquals(a.getUserid(),adminService.loginAdmin(a.getUserid(), a.getPassword()).get(0).getUserid());
	}
		
	//Registration	
	@Test
	void loginTest()
	{
		Registation reg= new Registation();
		reg.setTitle("Mr");
		reg.setFirstName("Abi");
		reg.setLastName("S");
		reg.setEmail("abi1001@gmail.com");
		reg.setPassword("abi1001");
		reg.setDob("01-08-10");
		reg.setPhoneNumber("987456123");
		regService.saveAll(reg);
		assertEquals(reg.getId(), regService.login(reg.getEmail(), reg.getPassword()).get(0).getId());	
	}
	
	@Test
	void updateUserTest()
	{
		Registation reg= new Registation();
		reg.setTitle("Mr");
		reg.setFirstName("Abi");
		reg.setLastName("S");
		reg.setEmail("abi1001@gmail.com");
		reg.setPassword("abi1001");
		reg.setDob("01-08-10");
		reg.setPhoneNumber("987456123");
		regService.saveAll(reg);
		reg.setFirstName("Abhi");
		regService.update_User(reg);
		assertEquals("Abhi",reg.getFirstName());
	}
	
	@Test
	void getUserTest()
	{
		Registation reg= new Registation();
		reg.setTitle("Mr");
		reg.setFirstName("Abi");
		reg.setLastName("S");
		reg.setEmail("abi1001@gmail.com");
		reg.setPassword("abi1001");
		reg.setDob("01-08-10");
		reg.setPhoneNumber("987456123");
		regService.saveAll(reg);
		assertEquals(reg,regService.getUser("abi1001@gmail.com"));	
	}
	
	//Flight
	@Test
	void saveFlightTest()
	{
		FlightDetails flight= new FlightDetails();
		flight.setSource("Mumbai");
		flight.setDestination("Chennai");
		flight.setDeparture_time("10:45");
		flight.setArrival_time("12:20");
		flight.setJourney_date(LocalDate.now().toString());
		flight.setAvailable_seats(10);
		flight.setRetruning("Yes");
		flight.setCost("20000");
		flightService.save(flight);
		assertEquals(flight.getSource(), flightService.getBySourceAndDestination(flight.getSource(), flight.getDestination()).get(0).getSource());
	}
	
	@Test
	void viewTest()
	{
		List<FlightDetails> f=flightService.view();
		f.forEach(li->System.out.println(li.getFlightId()));
		assertNotNull(f);
	}
	
	@Test
	void FindByIdTest()
	{
		FlightDetails f = new FlightDetails();
		flightService.save(f);
		assertEquals(f.getFlightId(),flightService.findById(f.getFlightId()).getFlightId());
	}
	
	@Test
	void flightTest()
	{
		FlightDetails f = new FlightDetails();
		flightService.save(f);
		flightService.deleteFlight(f.getFlightId());
		assertEquals(null,flightService.findById(f.getFlightId()));
	}
	
	//seat
	@Test
	void getAvailableSeatByFlightIdTest()
	{
		assertNotNull(seatService.getAvailableSeatByFlightId(1));
	}
		
	@Test
	void addSeatTest()
	{
		Seat s = new Seat();
		s.setFlight_id(1);
		s.setSeatNo("A5");
		s.setStatus(0);
		assertNotNull(seatService.addSeat(s));
	}
	
	@Test
	void listSeatTest()
	{
		List<Seat> list=seatService.listSeat();
		assertNotNull(list);
	}

	//ticket
	@Test
	void allticketTest()
	{
		TicketDetails ticket= new TicketDetails();
		List<TicketDetails> list=ticketService.allticket(ticket.getTicketid());
		assertNotNull(list);
	}
	
	@Test
	void cancelTicketTest()
	{
		TicketDetails t = new TicketDetails();
		ticketService.saveAll(t);
		ticketService.cancelTicket(t.getTicketid());
		assertEquals("Canceled",t.getStatus());
	}
	

	@Test
	void bookTicketTest()
	{
		TicketDetails t = new TicketDetails();
		ticketService.saveAll(t);
		ticketService.confirmTicket(t.getTicketid());
		assertEquals("Booked",t.getStatus());
	}
	
	//Passenger
	@Test
	void passangerTest() {
		assertNotNull(passService.getDetails());
	}
	
	//Mail
	@Test
	void MailTest()
	{
		MailDetails m = new MailDetails();
		m.setMsgBody("Hello World");
		m.setRecipient("abhisharma13900@gmail.com");
		m.setSubject("Testing");
		assertEquals("Mail Sent Successfully...",mailService.sendSimpleMail(m));
	}
	
	@Test
	void ForgetPasswordTest()
	{
		String m ="abhisharma13900@gmail.com";
		assertEquals("Mail Sent Successfully.......",mailService.forgetPassword(m));
	}
	
}
