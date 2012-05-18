package alocadorhorarios
import grails.converters.JSON
import grails.plugins.springsecurity.Secured

class ItemGradeController {

	@Secured(['IS_AUTHENTICATED_REMEMBERED'])
	def index() {
		redirect(action: "list", params: params)
	}
    def scaffold = true
	
	
	def periodo = {
		[departamentos:Departamento.list(), disciplinas:Disciplina.list()]
	}

	def SalvarItemGrade(){
		def pe = Periodo.get(params.int('idPerido'))
		def di = Disciplina.get(params.int('idDisciplina'))
		def i=new ItemGrade()
		di.addToItensGrade(i)
		pe.addToItensGrade(i)
		i.save()
		
	}
}
