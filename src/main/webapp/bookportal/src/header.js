import React from 'react'
import './css/bootstrap.min.css'
export default class Header extends React.Component {

    render() {
        return (
            <div>
                <nav className="navbar navbar-expand-lg navbar-dark bg-primary">
                    <button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor01" aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
                        <span className="navbar-toggler-icon"></span>
                    </button>

                    <div className="collapse navbar-collapse" id="navbarColor01">
                        <ul className="navbar-nav mr-auto">
                            <li className="nav-item active">
                            <div className="btn-group" role="group" aria-label="Basic example">
                            <button type="button" className="btn btn-secondary">Add Book</button>
                            <button type="button" className="btn btn-secondary">Add Author</button>
                        </div>
                            </li>
                            <li className="nav-item">
                                <a className="nav-link" href="#">Home</a>
                            </li>
                            <li className="nav-item">
                                <a className="nav-link" href="#">My lists</a>
                            </li>

                        </ul>
                        <form className="form-inline my-2 my-lg-0">
                            <input className="form-control mr-sm-2" type="text" name="inputValue" value={this.props.vl} onChange={this.props.inputMethod} placeholder="Search" />
                            <button className="btn btn-secondary my-2 my-sm-0" onClick={() => {this.props.clickMethod(this.props.value)}} type="button">Search</button>
                        </form>
                    </div>
                </nav>
            </div>
        )
    }
}