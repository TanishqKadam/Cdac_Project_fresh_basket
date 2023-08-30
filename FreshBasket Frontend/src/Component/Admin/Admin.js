import { useNavigate } from "react-router-dom";
import AdminNavBar from "./AdminNavBar";

function Admin() {
    const navigate = useNavigate();
    return (
        <div style={{backgroundColor: 'lightgreen'}}>
            <AdminNavBar />
            <div className="d-flex align-items-center text-center" style={{ minHeight: '80vh', backgroundImage: 'url("https://cdn.dribbble.com/users/1031509/screenshots/2569406/gifbasket.gif")', backgroundSize: '910px', backgroundRepeat: 'no-repeat', backgroundPosition: 'center center' }}>
                <div className="box w-100 text-success" >
                    <button type="button" className="btn btn-primary btn-lg mx-2" onClick={() => navigate('/admin/farmer')}>All Farmers List</button>
                    <button type="button" className="btn btn-primary btn-lg mx-2" onClick={() => navigate('/admin/category')}>Product Category</button>
                    <button type="button" className="btn btn-primary btn-lg mx-2" onClick={() => navigate('/admin/productslist')}>Products List</button>
                    <button type="button" className="btn btn-primary btn-lg mx-2" onClick={() => navigate('/admin/order')}>Orders List</button>
                    <button type="button" className="btn btn-primary btn-lg mx-2" onClick={() => navigate('/admin/userslist')}>Registered Users List</button>
                </div>
            </div>
            <div className="text-center mt-5 text-muted" style={{backgroundColor: '#30c732'}}>
                Copyright &copy; 2023 &mdash; FreshBasket
            </div>
        </div>
    );
}

export default Admin;