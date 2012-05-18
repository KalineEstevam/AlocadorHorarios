import alocadorhorarios.Papel
class BootStrap {

    def init = { servletContext ->
		def usuarioDefault = Papel.findByAuthority('ROLE_USER') ?: new Papel(authority: 'ROLE_USER').save(failOnError: true)
		
    }
    def destroy = {
    }
	
}
