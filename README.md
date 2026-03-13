# Gestion des Étudiants - Backend Spring Boot

## Description

Ce projet est une **API REST développée avec Spring Boot** permettant de gérer les étudiants à travers des opérations CRUD (Create, Read, Update, Delete).

L'application expose des endpoints REST qui peuvent être consommés par une application frontend (par exemple Angular) afin de gérer une liste d'étudiants.

Chaque étudiant possède les informations suivantes :

* id
* nom
* prenom
* email

Le projet illustre une architecture backend simple basée sur les bonnes pratiques du développement avec Spring Boot.

---

## Technologies utilisées

* Java
* Spring Boot
* Spring Web
* Spring Data JPA
* Hibernate
* MySQL / H2 Database
* Maven

---

## Architecture du projet

Le projet suit une architecture en couches (Layered Architecture) :

controller → gestion des requêtes HTTP
service → logique métier
repository → accès à la base de données
model → représentation des entités

Structure du projet :

src/main/java/com/example/gestion_etudiant_backend

controller
EtudiantController.java

service
EtudiantService.java

repository
EtudiantRepository.java

model
Etudiant.java

GestionEtudiantBackendApplication.java

---

## Fonctionnalités

L'API permet de :

* Ajouter un étudiant
* Consulter la liste des étudiants
* Consulter un étudiant par son id
* Modifier les informations d'un étudiant
* Supprimer un étudiant

---

## Endpoints API

GET /etudiants
Retourne la liste des étudiants

GET /etudiants/{id}
Retourne un étudiant spécifique

POST /etudiants
Ajoute un nouvel étudiant

PUT /etudiants/{id}
Modifie un étudiant

DELETE /etudiants/{id}
Supprime un étudiant

---

## Exemple de requête JSON

POST /etudiants

{
"nom": "Dupont",
"prenom": "Jean",
"email": "[jean.dupont@email.com](mailto:jean.dupont@email.com)"
}

---

## Lancer le projet

1. Cloner le projet

git clone https://github.com/DilaneLado/gestion-etudiant-backend.git

2. Ouvrir le projet dans votre IDE (IntelliJ, Eclipse ou VS Code)

3. Lancer l'application

mvn spring-boot:run

L'application sera accessible sur :

http://localhost:8080

---

## Objectif du projet

Ce projet a été réalisé dans le but de :

* comprendre l'architecture d'une API REST avec Spring Boot
* mettre en pratique les opérations CRUD
* connecter un backend Spring Boot avec un frontend Angular
