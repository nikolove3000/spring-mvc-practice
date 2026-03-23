# 🌱 spring-mvc-practice

A hands-on learning project for mastering **Spring MVC** from the ground up — pure Spring MVC, no Spring Boot.

---

## 📚 Lessons

### ✅ Lesson 01 — Project Setup
> `DispatcherServlet` · `HandlerMapping` · `ViewResolver`

Understanding how Spring MVC handles HTTP requests from end to end.

- Configured `DispatcherServlet` via `web.xml`
- Set up `InternalResourceViewResolver` to resolve JSP views
- Mapped first controller with `@GetMapping`

---

### ✅ Lesson 02 — Form Handling
> `@RequestParam`

Receiving individual form fields from HTTP requests.

- Created a simple product form
- Received form input using `@RequestParam`

---

### ✅ Lesson 03 — Model Binding
> `@ModelAttribute`

Binding form data directly to a model object.

- Bound form fields to `Product` object automatically via `@ModelAttribute`
- Passed data to view using `Model`

---

### ✅ Lesson 04 — Bean Validation
> `@Valid` · `@NotBlank` · `@Min` · `BindingResult`

Validating user input on the server side.

- Applied `@NotBlank` and `@Min` on `Product` fields
- Displayed validation errors in JSP using Spring form tags

---

### ✅ Lesson 05 — PRG Pattern
> `RedirectAttributes` · `FlashAttribute`

Preventing duplicate form submission on browser refresh.

- Implemented Post-Redirect-Get pattern
- Passed success data across redirect using `addFlashAttribute`

---

### ✅ Lesson 06 — Exception Handling
> `@ExceptionHandler` · `@ControllerAdvice`

Handling exceptions globally in a clean, centralized way.

- Created `ProductNotFoundException` extending `RuntimeException`
- Handled exception globally via `GlobalExceptionHandler` with `@ControllerAdvice`
- Displayed user-friendly error page instead of stack trace

---

### ✅ Lesson 07 — Interceptor
> `HandlerInterceptor` · `preHandle`

Intercepting HTTP requests before they reach the controller.

- Implemented `LoggingInterceptor` to log request URL and timestamp
- Registered interceptor in `spring-mvc.xml`

---

### ✅ Lesson 08 — Session
> `@SessionAttributes` · `SessionStatus`

Persisting data across multiple requests using HTTP Session.

- Built a 2-step order form using `@SessionAttributes`
- Cleared session after completion with `SessionStatus.setComplete()`

---

### ✅ Lesson 09 — File Upload
> `MultipartFile` · `multipart-config`

Handling file uploads from HTML forms.

- Configured `StandardServletMultipartResolver` and `multipart-config`
- Received uploaded file via `@RequestParam MultipartFile`
- Displayed file name and size in result view

---

## 🛠️ Tech Stack

| Tool | Version |
|---|---|
| Java | 21 |
| Spring MVC | 7.0.5 |
| Apache Tomcat | 10.1.52 |
| Hibernate Validator | 9.0.1 |
| JSP + JSTL | Jakarta EE |
| Build Tool | Maven |
| IDE | IntelliJ IDEA |

---

## 📁 Project Structure
```
src/
└── main/
    ├── java/com/example/
    │   ├── controller/
    │   ├── model/
    │   ├── exception/
    │   ├── advice/
    │   └── interceptor/
    └── webapp/
        └── WEB-INF/
            ├── views/
            ├── spring-mvc.xml
            └── web.xml
```

---

## 📌 Conventions Applied

- Javadoc on all public classes and methods (`@param`, `@return`, `@throws`)
- Single Responsibility Principle per class
- `camelCase` / `PascalCase` / `UPPER_SNAKE_CASE` used correctly
- Sensitive config files excluded from version control

---

## 🗺️ Learning Roadmap

- [x] Spring Core — DI, IoC Container
- [x] Spring Context — `@Component`, `@Autowired`, `@ComponentScan`
- [x] AOP — `@Aspect`, `@Before`, `@After`, `@Around`
- [x] Servlet + Tomcat (traditional)
- [x] Spring MVC (pure)
- [ ] Spring Boot
- [ ] Spring Data JPA + REST API
- [ ] Spring Security