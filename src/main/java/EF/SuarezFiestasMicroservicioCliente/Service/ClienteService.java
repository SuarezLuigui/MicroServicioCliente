package EF.SuarezFiestasMicroservicioCliente.Service;

import java.util.List;
import EF.SuarezFiestasMicroservicioCliente.Model.Cliente;

public interface ClienteService {

	List<Cliente> listar();
	Cliente ObtenerId(Integer id);	
	void guardar(Cliente cliente);
	void eliminar(Integer id);
	void actualizar(Cliente cliente);	
}
