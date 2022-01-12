package study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import study.DAO.BookDAO;
import study.entity.BookEntity;

@RestController
@RequestMapping(path = "/book")
public class BookController {
	
	@Autowired
	BookDAO dao;
	
	@PostMapping("/add/{id}/{name}/{cost}")
	public void insert(@PathVariable int id, @PathVariable String name, @ PathVariable int cost)
	{
		dao.addBook(id, name, cost);
	}

	
	@GetMapping("/getAll")
	public List<BookEntity> getAll()
	{
		return dao.getAll();
	}
	
	@GetMapping("/getbookbycost/{cost}")
	public List<BookEntity> getBookByCost(@PathVariable int cost)
	{
		
		return dao.getBookByCost(cost);
	}
	
	@GetMapping("/getbyname/{name}")
	public List<BookEntity> getBookByname(@PathVariable String name)
	{
		return dao.getBookByName(name);
	}
	
	@GetMapping("/costlessthan/{cost}")
	public List<BookEntity> getBookCostLessThan(@PathVariable int cost)
	{
		return dao.getBookByCostLessThan(cost);
	}
	
	@GetMapping("/costgreterthan/{cost}")
	public List<BookEntity> getBookCostGreterThan(@PathVariable int cost)
	{
		return dao.getBookByCostGreterThan(cost);
	}
	
	
	
}
