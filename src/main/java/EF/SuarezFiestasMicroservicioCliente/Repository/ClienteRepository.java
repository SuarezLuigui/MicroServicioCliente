package EF.SuarezFiestasMicroservicioCliente.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EF.SuarezFiestasMicroservicioCliente.Model.Cliente;


@Repository
public interface ClienteRepository  extends JpaRepository<Cliente, Integer> {


}
