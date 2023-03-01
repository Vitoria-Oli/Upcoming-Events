INSERT INTO events (id_event, date, description, hour, name, recommended, capacity) VALUES (default, '2023-07-09', 'Bla bla bla.', '21:00:00', 'The Boss en Gijón', true, 646)
INSERT INTO events (id_event, date, description, hour, name, recommended, capacity) VALUES (default, '2023-08-09', 'Blo blo blo.', '20:00:00', 'Tina Turner en Gijón', false, 987)
INSERT INTO events (id_event, date, description, hour, name, recommended, capacity) VALUES (default, '2023-09-09', 'Blu blu blu.', '21:30:00', 'U2 en Gijón', false, 432)

INSERT INTO images (id_image, name, id_event) VALUES(default, 'Una', 1)
INSERT INTO images (id_image, name, id_event) VALUES(default, 'Una más', 1)
INSERT INTO images (id_image, name, id_event) VALUES(default, 'Una máde además', 1)
INSERT INTO images (id_image, name, id_event) VALUES(default, 'Otra', 2)
INSERT INTO images (id_image, name, id_event) VALUES(default, 'Una otra', 3)

INSERT INTO users (id_user, name, email, password) VALUES(default, 'Pepin','yuer@.es','65473')
INSERT INTO users (id_user, name, email, password) VALUES(default, 'Paco','yuuro@.es','65473')
INSERT INTO users (id_user, name, email, password) VALUES(default, 'Pon','kerar@.es','65473')

INSERT INTO users_event (user_id_user, event_id_event) VALUES (1, 1)
INSERT INTO users_event (user_id_user, event_id_event) VALUES (1, 2)
INSERT INTO users_event (user_id_user, event_id_event) VALUES (1, 3)
INSERT INTO users_event (user_id_user, event_id_event) VALUES (2, 1)
INSERT INTO users_event (user_id_user, event_id_event) VALUES (3, 2)