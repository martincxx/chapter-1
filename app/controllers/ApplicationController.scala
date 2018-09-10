package controllers

import javax.inject.Inject
import play.api.mvc.{AbstractController, ControllerComponents}

//@Singleton
class ApplicationController @Inject() (cc: ControllerComponents) extends AbstractController(cc){

  def hello (name: String) = Action {
      //Ok("Hello "+name)
      Ok(views.html.hello(name))
  }
}
