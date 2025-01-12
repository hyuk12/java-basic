package dev.study.퍼샤드.movie;

public class MovieFacade {
  private final TicketService ticketService = new TicketService();
  private final SeatService seatService = new SeatService();
  private final PaymentService paymentService = new PaymentService();

  public void watchMovie(String movie) {
    ticketService.bookTicket(movie);
    seatService.assignSeat(movie);
    paymentService.makePayment(movie);
  }

}
