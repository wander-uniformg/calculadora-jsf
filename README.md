# Projeto de uma calculadora básica usando JSF - 2023

### Requisitos:

1. JDK 11
2. JSF 3.0
3. Java EE: Jakarta EE 9
4. GlassFish Server 6.2.1

### Bibliotecas necessárias:

1. Jakarta EE Web 9 API Library
2. Jakarta EE 9 API Library

### Configurações

- context-param-name: jakarta.faces.DEFAULT_SUFFIX
- context-param-value: .xhtml
- servlet: jakarta.faces.webapp.FacesServlet
- url-pattern: *.xhtml
- resource-env-ref-name: BeanManager
- resource-env-ref-type: jakarta.enterprise.inject.spi.BeanManager
- web-app version: 5.0
