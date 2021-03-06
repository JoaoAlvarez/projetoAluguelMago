import Controllers.ClienteController;
import models.Pessoa;
import models.PessoaFisica;

public class main {

    public static void main(String[] args) {
        System.out.println("Started");
        ClienteController clienteController = new ClienteController();

        //criarCliente(clienteController);

    }

    public static void criarCliente(ClienteController controller){
        System.out.println("[Main]Criar Cliente");
        PessoaFisica pf = new PessoaFisica();
        pf.setNome("João");
        pf.setCpf("123456789");
        pf.setEndereco("Rua dos bobos numero 0");
        pf.setCnh("123555");

        int idClienteSalvo = controller.criarCliente(pf);
        System.out.println("[Main]Cliente criado - ID:"+idClienteSalvo);

        consultarCliente(idClienteSalvo , controller);
    }

    public static void consultarCliente(int id, ClienteController controller){
        System.out.println("[Main]Consulta cliente - ID:"+id);
        Pessoa pessoa = controller.consultarCliente(id);

        System.out.println("[Main] Pessoa encontrada:"+pessoa.toString());

    }


}
