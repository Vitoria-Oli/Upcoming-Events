-- INSERT INTO events (id_event, capacity, date, description, hour, image, name, freeplaces_id_freeplaces, recommended_id_recommended) VALUES (default, 2500, '2023-07-09', 'Bla bla bla.', '21:00:00', 'Una imagen', 'The Boss en Gijón', null, null)
-- INSERT INTO events (id_event, capacity, date, description, hour, image, name, freeplaces_id_freeplaces, recommended_id_recommended) VALUES (default, 1500, '2023-08-09', 'Blo blo blo.', '20:00:00', 'Otra imagen', 'Tina Turner en Gijón', null, null)
-- INSERT INTO events (id_event, capacity, date, description, hour, image, name, freeplaces_id_freeplaces, recommended_id_recommended) VALUES (default, 500, '2023-09-09', 'Blu blu blu.', '21:30:00', 'Otra otra imagen', 'U2 en Gijón', null, null)

INSERT INTO freeplaces(id_freeplaces, freeplaces, event_id_event) VALUES (default, 1200, null)
INSERT INTO freeplaces(id_freeplaces, freeplaces, event_id_event) VALUES (default, 1000, null)
INSERT INTO freeplaces(id_freeplaces, freeplaces, event_id_event) VALUES (default, 200, null)

INSERT INTO events (id_event, capacity, date, description, hour, image, name, freeplaces_id_freeplaces) VALUES (default, 2500, '2023-07-09', 'Bla bla bla.', '21:00:00', 'Una imagen', 'The Boss en Gijón', 1)
INSERT INTO events (id_event, capacity, date, description, hour, image, name, freeplaces_id_freeplaces) VALUES (default, 1500, '2023-08-09', 'Blo blo blo.', '20:00:00', 'Otra imagen', 'Tina Turner en Gijón', 2)
INSERT INTO events (id_event, capacity, date, description, hour, image, name, freeplaces_id_freeplaces) VALUES (default, 500, '2023-09-09', 'Blu blu blu.', '21:30:00', 'Otra otra imagen', 'U2 en Gijón', 3)

UPDATE freeplaces SET event_id_event = 1 WHERE id_freeplaces=1
UPDATE freeplaces SET event_id_event = 2 WHERE id_freeplaces=2
UPDATE freeplaces SET event_id_event = 3 WHERE id_freeplaces=3

INSERT INTO recommended (id_recommended, recommended, event_id_event) VALUES (default, true, 1)

UPDATE events SET recommended_id_recommended = 1 WHERE id_event = 1

