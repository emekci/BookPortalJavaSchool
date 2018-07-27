import React, {Component} from 'react';

export default class Book extends Component {

    render() {
        return(
            <div className="col-md-4 my-4">
                <div className="card">
                    <img className="card-img-top" src={this.props.imgLink} alt="Book Logo" />
                    <div className="card-body">
                        <h5 className="card-title text-center">{this.props.title}</h5>
                        <p className="card-text text-center">{this.props.authors}</p>
                    </div>
                    <div className="card-footer">
                    <div className="btn-group" role="group" aria-label="Basic example">
                        <button type="button" className="btn btn-secondary">Add To Wishlist</button>
                        <button type="button" className="btn btn-secondary">Add to FavouriteList</button>
                    </div>
                    </div>
                </div>
            </div>
        )
    }
}