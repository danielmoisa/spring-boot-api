import React, { useState, useEffect } from "react";
import "./App.css";
import axios from "axios";

interface Student {
	id: String;
	name: String;
	email: String;
	dob: Date;
}

function App() {
	const [data, setData] = useState<Student[]>([]);

	useEffect(() => {
		const fetchData = async () => {
			const result = await axios("http://localhost:8080/api/v1/student");

			setData(result.data);
		};

		fetchData();
	}, []);

	console.log(data);

	return (
		<>
			{data?.map((s, i) => (
				<div key={i}>
					<div>{s.name}</div>
					<div>{s.email}</div>
					<div>{s.dob}</div>
				</div>
			))}
		</>
	);
}

export default App;
