package controllers

import play.api.mvc._

object Session extends Controller {
  def preferences = TODO
  def login = TODO
  def register = TODO
  def index = Action {
    Ok(views.html.login())
  }
  def logout = TODO
  def password = TODO
}
