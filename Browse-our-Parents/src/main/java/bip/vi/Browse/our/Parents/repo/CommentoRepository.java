package bip.vi.Browse.our.Parents.repo;

import bip.vi.Browse.our.Parents.entities.Commento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentoRepository extends JpaRepository<Commento, Integer> {
}