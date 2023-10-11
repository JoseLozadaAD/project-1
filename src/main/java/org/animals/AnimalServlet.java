package org.animals;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/animals")
public class AnimalServlet extends HttpServlet {
  private List<Animal> animals = new ArrayList<>();

  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    String animalType = request.getParameter("animalType");
    String name = request.getParameter("name");

    if (animalType.equals("dog")) {
      animals.add(new Dog(name));
    } else if (animalType.equals("cat")) {
      animals.add(new Cat(name));
    }

    response.sendRedirect(request.getContextPath() + "/animals");
  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    request.setAttribute("animals", animals);
    request.getRequestDispatcher("/animals.jsp").forward(request, response);
  }
}
