package schedule.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import schedule.models.BuzzerOnPair;

import java.util.List;

public interface BuzzerDao extends JpaRepository<BuzzerOnPair, Long> {
    BuzzerOnPair getBuzzerOnPairById(Long id);
    BuzzerOnPair save(BuzzerOnPair buzzer);
    void delete(BuzzerOnPair buzzer);

    List<BuzzerOnPair> findByOrderByPairNumber();
}
