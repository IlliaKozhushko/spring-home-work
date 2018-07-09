# spring-home-work

Необходимо создать веб-приложение, которое позволяет:
1. Выполнять регистрацию пользоваталей
2. Выполнять авторизацию пользователей
3. Выполнять CRUD операции над следующими объектами:
=========================
Продукт:
Идентификатор UUID;
Имя строки;
BigDecimal цена;
Производитель производителя;
==========================
производитель
Идентификатор UUID;
Имя строки;
Установите продукты <Product>;
==========================
Роль
Идентификатор UUID;
Имя строки;
==========================
пользователь
Идентификатор UUID;
String email;
Строковый пароль;
Строка firstName;
String lastName;
Установите роли <Role>;
==========================
Роли пользователей:
1. Admin - имеет возможность выполнять все операции CRUD
2. Пользователь - имеет доступ только для чтения

В базе данных хранятся данные о производителях (Производитель) и товарах (Продукт).
Каждый товар имеет одну производителя, и каждый производитель имеет набор товаров.
Страницы:
1. Производители (список производителей + возможность создавать новых, редактировать и удалять созданных производителей)
2. Products (список товаров + возможность создавать новых, редактировать и удалять созданные товары)
3. Users (список всех ползователей приложения + возможность создавать новых, редактировать и удалять созданных пользователей) - ТОЛЬКО для ADMIN (и чтение и редактирование)

При создании товара выбор производителя реализовать с помощью выпадающего меню.
Результатом выполнения задания должны быть:
- рабочее приложение, развернутое на heroku - https://www.heroku.com/ или в AWS
- отдельный репозиторий с описанием задачи,
подробными инструкциями по запуску приложения на локальной машине,
файлами для инициализации и заполнения БД и ссылкой на видео с демонстрацией работы приложения.
Необходимо придерживаться паттерна MVC (model, view, controller).
Все классы должны быть грамотно разложены по пакетам и грамотно именованы (модель, дао, контроллер).

Технологии:
Java, SQL, Spring (MVC, Data, Security, Spring Boot), JSP или (HTML и CSS и JS или React Angular), Maven, Tomcat, Git