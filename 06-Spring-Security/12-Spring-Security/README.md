# 12-Spring-Security

18 lessons on Spring Security: default login, session ID, CSRF tokens, multiple users, UserDetailsService, UserPrincipal, BCrypt encoding, user registration, AuthenticationProvider.

**Tech:** Spring Boot 3, Spring Security, JPA, PostgreSQL, Maven

**Fixes applied:** NoOpPasswordEncoder → PasswordEncoderFactories, withDefaultPasswordEncoder → BCrypt, missing UserPrincipal class added, @Repository added to UserRepo.
