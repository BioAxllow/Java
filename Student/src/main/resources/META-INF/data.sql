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

INSERT INTO mokytojai() VALUES ();


-- SELECT s.vardas As 'studento vardas', s.pavarde As pavardė, p.pazymys As 'gautas pažymys'
-- FROM studentai AS s JOIN pazymiai AS p ON s.Id=p.studentas_id
-- WHERE p.data='2018-08-12';

-- SELECT * FROM studentai;
-- SELECT * FROM pazymiai;
--
-- SELECT st.vardas, pz.pazymys FROM studentai st INNER JOIN pazymiai pz WHERE st.id=pz.studentas_id ORDER BY st.vardas;
--
-- -- Suskaičiuokite kiek iš viso lentelėje yra sudentų (įrašų):
-- SELECT COUNT(*) FROM studentai;
--
-- -- Išveskite visus pažymius gautus 2018.08.12 dieną (sąrašas turi būti toks: studento vardas, pavardė, jo pažymių vidurkis).
-- SELECT 	st.vardas AS 'studento vardas', st.pavarde AS 'pavardė', paz.pazymys AS 'gautas pažymys', paz.data
-- FROM studentai st
-- JOIN pazymiai paz
-- ON st.id=paz.studentas_id
-- WHERE paz.data='2018.08.12';
--
-- -- Išveskite visų studentų vidurkius (sąrašas turi būti toks: studento vardas, pavardė, jo pažymių vidurkius).
-- SELECT st.vardas AS 'studento vardas', st.pavarde AS 'pavardė', CAST(AVG(paz.pazymys) AS DECIMAL(100,2)), paz.data AS vidurkis
-- FROM studentai AS st
-- JOIN pazymiai AS paz
-- ON st.id=paz.studentas_id
-- GROUP BY paz.studentas_id;
--  -- GROUP BY st.id;
--
-- -- Išveskite visus studentus, kurių vidurkis didesnis nei 9.
-- SELECT st.vardas, CAST(AVG(paz.pazymys) AS DECIMAL (3,2)) AS vidurkis
-- FROM studentai AS st
-- JOIN pazymiai AS paz
-- ON st.id=paz.studentas_id
-- GROUP BY paz.studentas_id
-- HAVING vidurkis>9;
--
-- -- Išveskite tų studentų el. Pašto adresus kurie turi mažiau arba tik po vieną pažymį.
-- SELECT st.el_pastas
-- FROM studentai AS st
-- WHERE (
-- SELECT COUNT(paz.pazymys)
-- FROM pazymiai paz
-- WHERE st.id=paz.studentas_id
-- GROUP BY paz.studentas_id)
-- <=1;
--
-- SELECT * FROM studentai
-- JOIN pazymiai ON studentai.id=pazymiai.studentas_id


