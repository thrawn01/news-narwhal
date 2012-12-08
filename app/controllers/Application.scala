package controllers

//import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def index(tag: String) = Action {
    Ok(views.html.index())
  }

  def latest(tag: String) = TODO
  def saved(tag: String) = TODO
  def user(user: String) = TODO
  def domain(name: String) = TODO
  def submit = TODO

}