import DataTable from "components/DataTable";
import Footer from "components/Footer";
import NavBar from "components/navbar";

function App() {
  return (
    <>
      <NavBar />
      <div className='container'>
        <h1 className="text-primary">Ola mundo</h1>
        <DataTable />
      </div>
      <Footer />
    </>
  );
}

export default App;
