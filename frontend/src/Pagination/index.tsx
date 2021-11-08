const Pagination = () => {
    return (
        <div className="d-flex justify-content-center">
    <nav>
        <ul className="pagination">
            <li className="page-item">
                <button className="page-link">Anterior</button>
            </li>
            <li className="page-item disabled">
                <span className="page-link">1</span>
            </li>
            <li className="page-item disabled">
                <button className="page-link">Próxima</button>
            </li>
        </ul>
    </nav>
</div>
    )
}

export default Pagination;