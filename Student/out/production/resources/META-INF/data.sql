INSERT INTO studentai (vardas, pavarde, el_pastas) VALUES('Gediminas', 'Jonaitis', 'g.jonaitis@gmail.com');
INSERT INTO studentai (vardas, pavarde, el_pastas) VALUES('Jonas', 'Petraitis', 'j.petraitis@gmail.com');
INSERT INTO studentai (vardas, pavarde, el_pastas) VALUES('Kazimieras', 'Lukšys', 'k.luksys@gmail.com');
INSERT INTO studentai (vardas, pavarde, el_pastas) VALUES('Rimas', 'Motuza', 'r.motuza@gmail.com');

INSERT INTO pazymiai (studentas_id  , data, pazymys) VALUES(1, '2018-08-12', 10);
INSERT INTO pazymiai (studentas_id  , data, pazymys) VALUES(2, '2018.08.12', 8);
INSERT INTO pazymiai (studentas_id  , data, pazymys) VALUES(3, '2018.08.12', 8);
INSERT INTO pazymiai (studentas_id  , data, pazymys) VALUES(4, '2018.08.12', 9);
INSERT INTO pazymiai (studentas_id  , data, pazymys) VALUES(1, '2018.08.16', 9);
INSERT INTO pazymiai (studentas_id  , data, pazymys) VALUES(2, '2018.08.16', 8);
INSERT INTO pazymiai (studentas_id  , data, pazymys) VALUES(3, '2018.08.16', 9);
INSERT INTO pazymiai (studentas_id  , data, pazymys) VALUES(1, '2018.08.17', 10);


-- SELECT s.vardas As 'studento vardas', s.pavarde As pavardė, p.pazymys As 'gautas pažymys'
-- FROM studentai AS s JOIN pazymiai AS p ON s.Id=p.studentas_id
-- WHERE p.data='2018-08-12';

