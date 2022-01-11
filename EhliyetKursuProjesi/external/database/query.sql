CREATE SEQUENCE instructor_id_seq INCREMENT 1 START 1 CACHE 1;
CREATE TABLE instructors
(
    id integer NOT NULL DEFAULT NEXTVAL('instructor_id_seq'),
    name character varying(25) NOT NULL,
    phone character varying(11) NOT NULL,
    surname character varying(25) NOT NULL,
    transaction_date timestamp without time zone NOT NULL,
    department character varying(25) NOT NULL,
    CONSTRAINT pk_instructors PRIMARY KEY (id)
);
CREATE SEQUENCE course_id_seq INCREMENT 1 START 1 CACHE 1;
CREATE TABLE courses
(
    id integer NOT NULL DEFAULT NEXTVAL('course_id_seq'),
    end_date timestamp without time zone NOT NULL,
    price double precision NOT NULL,
    starting_date timestamp without time zone NOT NULL,
    vehicle character varying(255) NOT NULL,
    instructor_id integer,
    CONSTRAINT pk_course PRIMARY KEY (id),
    CONSTRAINT fk_course_instructor FOREIGN KEY (instructor_id) REFERENCES instructors (id)
);
CREATE SEQUENCE candidate_id_seq INCREMENT 1 START 1 CACHE 1;
CREATE TABLE candidates
(
    id integer NOT NULL DEFAULT NEXTVAL(' candidate_id_seq '),
    name character varying(25) NOT NULL,
    phone character varying(11) NOT NULL,
    surname character varying(25) NOT NULL,
    transaction_date timestamp without time zone NOT NULL,
    identity_number character varying(11) NOT NULL,
    register_date timestamp without time zone NOT NULL,
    course_id integer,
    CONSTRAINT pk_candidates PRIMARY KEY (id),
    CONSTRAINT fk_candidate_course FOREIGN KEY (course_id) REFERENCES courses (id)

);

INSERT INTO public.instructors(name, phone, surname, transaction_date,department) VALUES ('Arzu', '123455432', 'Öztürk',localtimestamp,'A');
INSERT INTO public.courses(end_date, price, starting_date,vehicle,instructor_id) VALUES (localtimestamp, 1300,localtimestamp,'A',1);
INSERT INTO public.candidates(name,phone,surname,transaction_date,identity_number,register_date,course_id) VALUES ('Hira',12333,'Öztürk',localtimestamp,'12343554',localtimestamp, 2);


