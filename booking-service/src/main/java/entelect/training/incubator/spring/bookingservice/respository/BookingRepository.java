package entelect.training.incubator.spring.bookingservice.respository;

import entelect.training.incubator.spring.bookingservice.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findAllByCustomerId(String customerId);
    List<Booking> findAllByFlightId(String customerId);
}
