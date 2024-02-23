package iesjandula.proyectounidad4.arraysdeobjetos.agregacion;

public class Tienda {
	private static final int CLIENTE_MAX = 200;
	private static final Cliente ClienteNull= new Cliente("Cliente","Mock","ZZZZZZZZZZZZZZZZZZZZ");

	
	private String nombre;
	private String direccion;
	private Cliente[] clientes;
	private int contClientes=0;

	public Tienda(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		clientes = new Cliente[CLIENTE_MAX];
		
		rellenaClientesNull();
	}
	
	public Tienda(String nombre, String direccion,Cliente[] clientArray) {
		
		this(nombre,direccion);
	}
	
	

	public String getNombre() {
		return nombre;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public Cliente[] getClientes() {
		return clientes;
	}

	public Cliente[] getClientesReales() {
		Cliente[] arrayCliente= new Cliente[contClientes];
		int cont=0;
		for(Cliente cliente: clientes) {
			if(cliente.compareTo(ClienteNull)!=0) {
				arrayCliente[cont]=cliente;
				cont++;
			}
		}
		return arrayCliente;
	}
	

	public boolean addCliente(Cliente cl) {
		int cont = 0;
		boolean hayHueco = false;
		while (cont < this.clientes.length && !hayHueco) {
			if (clientes[cont].compareTo(ClienteNull) == 0) {
				hayHueco = true;
			} else {
				cont++;
			}
		}
		if (hayHueco) {
			clientes[cont] = cl;
			contClientes++;
		}
		return hayHueco;
	}

	public boolean borrarCliente(Cliente cl) {
		boolean encontrado = false;
		for (int i = 0; i < CLIENTE_MAX && !encontrado; i++) {
			if (clientes[i].equals(cl)) {
				encontrado = true;
				clientes[i] = null;
				contClientes--;
			}
		}
		return encontrado;
	}
	public boolean hayClientes() {
		return contClientes > 0;
	}
	
	public Cliente buscarClienteForDni(String dni) {
		for (int i = 0; i < CLIENTE_MAX;i++) {
			if(clientes[i].getDni().equals(dni)) {
				return clientes[i];
			}
		}
		return null;
	}
	
	private void rellenaClientesNull() {
		
		for(int i=0; i<CLIENTE_MAX;i++) {
			clientes[i]=ClienteNull;
		}
	}
}