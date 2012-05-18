package alocadorhorarios
import grails.plugins.springsecurity.Secured

class DisciplinaController {

	@Secured(['IS_AUTHENTICATED_REMEMBERED'])
	def index() {
		redirect(action: "list", params: params)
	}
	
    def scaffold = true
}
